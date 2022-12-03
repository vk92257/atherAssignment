package com.ather.assignment

import android.icu.text.SimpleDateFormat
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ather.assignment.ui.theme.MyApplicationTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                color = colorResource(id = R.color.gradient).copy(
                                    alpha = 0.4f
                                )
                            )
                    ) {

                        // on below line we are creating and initializing
                        // variable for simple date format.
                        val date = SimpleDateFormat("dd-MM-yyyy ")

                        val time = SimpleDateFormat("hh:mm:ss z")


                        // on below line we are creating a variable for
                        // current date and time and calling a simple
                        // date format in it.
                        val currentDate = date.format(Date())
                        val currentTime = time.format(Date())

                        Greeting(
                            value = currentDate
                        )
                        Spacer(modifier = Modifier.size(20.dp))

                        Greeting(
                            title = "Time", value = currentTime
                        )


                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String = "Date", value: String = "12tth dec 2022") {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(
                all = 30.dp
            )
            .shadow(
                shape = RoundedCornerShape(5.dp), elevation = 4.dp
            )
            .background(
                color = Color.White, shape = RoundedCornerShape(5.dp),
            ), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                vertical = 10.dp
            ),
            color = colorResource(id = R.color.dark_pink),
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 25.sp,
        )

        Text(
            text = value,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                vertical = 10.dp
            ),
            color = colorResource(id = R.color.black),
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 25.sp,

            )


    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}