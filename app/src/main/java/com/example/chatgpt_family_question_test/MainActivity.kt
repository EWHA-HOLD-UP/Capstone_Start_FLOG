package com.example.chatgpt_family_question_test

import android.os.Bundle
import android.telecom.Call
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import okhttp3.Callback
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException

class MainActivity : AppCompatActivity() {
    private val client = OkHttpClient()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<ImageButton>(R.id.button)
        val answer = findViewById<TextView>(R.id.answers)

        button.setOnClickListener {
            getResponse() { response ->
                    runOnUiThread {
                        answer.text = response
                    }
                }
            }
        }


    fun getResponse(callback: (String) -> Unit) {
        val url = "https://api.openai.com/v1/completions"
        val apiKey = "api입력"

        val requestBody = """
    {
        "model": "text-davinci-003",
        "prompt": "가족과 함께 답변하며 서로에 대해 알아갈 수 있는 질문을 한 개 생성해줘. 큰 따옴표 안에 질문을 넣어서, 번역체가 아닌 자연스러운 한국어로 작성해줘. 꼭 존댓말로 말해줘. 내가 똑같이 물어봐도 물어볼 때마다 기존과 다른 내용의 새 질문이 계속해서 나와야 해. 취미나 관심사에 대한 질문도 좋고, 진지한 질문도 좋아.",
        "max_tokens": 1000,
        "temperature": 0
    }
""".trimIndent()

        val request = Request.Builder()
            .url(url)
            .addHeader("Content-Type", "application/json")
            .addHeader("Authorization", "Bearer $apiKey")
            .post(requestBody.toRequestBody("application/json".toMediaTypeOrNull()))
            .build()

        client.newCall(request).enqueue(object : Callback {

            override fun onFailure(call: okhttp3.Call, e: IOException) {
                Log.e("error", "API failed", e)
            }

            override fun onResponse(call: okhttp3.Call, response: Response) {
                val body = response.body?.string()
                if (body != null) {
                    Log.v("data", body)
                }
                else {
                    Log.v("data", "empty")
                }
                val jsonObject = JSONObject(body)
                val jsonArray: JSONArray = jsonObject.getJSONArray("choices")
                val textResult = jsonArray.getJSONObject(0).getString("text")
                callback(textResult)

            }
        })
    }
}