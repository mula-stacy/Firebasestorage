package com.example.firebasestorage.screens.home

import android.content.Intent
import android.provider.Settings
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.InsertActivity
import com.example.firebasestorage.LocationActivity
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_CONTACT
import com.example.firebasestorage.navigation.ROUT_LOGIN
import com.example.firebasestorage.navigation.ROUT_SIGNUP

@Composable
fun HomeScreen(navController:NavHostController) {
    val mContext = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {

        //TopAppBar
        TopAppBar(
            title = { Text(text = "HomePage") },
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUT_LOGIN)
                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "arrowback")
                }
            },
            actions = {
                IconButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))


                }) {
                    Icon(imageVector = Icons.Filled.Share, contentDescription = "share")
                }
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, LocationActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Filled.LocationOn, contentDescription = "Location")
                }
            },
            backgroundColor = Color.Green
        )
        androidx.compose.material3.Text(
            text = "MIRRAW",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 100.dp)
        )


        //Row1
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_16),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    androidx.compose.material3.Text(
                        text = "Necklace sets",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }


            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(
                    modifier = Modifier.padding(10.dp)
                        .clip(shape = CircleShape),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_13),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    androidx.compose.material3.Text(
                        text = "Bangles ",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(
                    modifier = Modifier.padding(10.dp)
                        .clip(shape = CircleShape),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_13),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    androidx.compose.material3.Text(
                        text = "Earrings",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_14),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    androidx.compose.material3.Text(
                        text = "Anklets",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))


        //Row1
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_16),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    androidx.compose.material3.Text(
                        text = "Pendents",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_17),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    androidx.compose.material3.Text(
                        text = "Rings",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(
                    modifier = Modifier.padding(10.dp)
                        .clip(shape = CircleShape),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_18),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "Dangler Drops",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_19),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .clip(shape = CircleShape),
                    )
                    androidx.compose.material3.Text(
                        text = "Mangalsutra",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(
            text = "",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold
        )
        //Row3
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_20),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .clip(shape = CircleShape),
                    )
                    androidx.compose.material3.Text(
                        text = "MaangTikka",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                            .clip(shape = CircleShape),
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(
            text = "",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold
        )
        //Row4
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_6),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_9),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_11),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(
            text = "",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold
        )
        //Row5
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_17),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_14),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "jewels",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(
            text = "",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold
        )
        //Row6
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_11),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "necklaces",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "silver",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_8),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp)
                    )
                    androidx.compose.material3.Text(
                        text = "gold rings",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))


    }
}






@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())

}

