package com.example.firebasestorage.screens.home

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
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
import com.example.firebasestorage.LocationActivity
import com.example.firebasestorage.InsertActivity
import com.example.firebasestorage.R
import com.example.firebasestorage.navigation.ROUT_LOGIN
import com.example.firebasestorage.navigation.ROUT_CONTACT
import com.example.firebasestorage.navigation.ROUT_UPLOAD



@Composable
fun HomeScreen(navController:NavHostController) {
    val mContext = LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {

        //TopAppBar
        TopAppBar(
            title = { Text(text = "MIRRAW", fontFamily = FontFamily.SansSerif) },
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUT_LOGIN)
                }) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "arrowback")
                }
            },
            actions = {
                IconButton(onClick = {

                }) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "share")
                }
                IconButton(onClick = {
                }) {
                    Icon(imageVector = Icons.Outlined.Favorite, contentDescription = "Location")
                }

                IconButton(onClick = {
                }) {
                    Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = "Location")
                }
            },
            backgroundColor = Color.Green
        )





        //Row1
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_16),
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
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
            Card(modifier = Modifier.size(150.dp)) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(shape = CircleShape),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_13),
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
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
            Card(modifier = Modifier.size(150.dp)) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(shape = CircleShape),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_13),
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
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
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_14),
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
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

        Divider(thickness = 6.dp, color = Color.LightGray)


        //Row2
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
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
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_17),
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
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
            Card(modifier = Modifier.size(150.dp)) {
                Column(
                    modifier = Modifier
                        .padding(10.dp)
                        .clip(shape = CircleShape),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.img_18),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
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
            Card(modifier = Modifier.size(150.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_19),
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
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


        androidx.compose.material3.Text(
            text = "Mirraw classic collection",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 5.dp)
        )//ROW3


        Row(
            modifier = Modifier
                .padding(10.dp)
                .horizontalScroll(rememberScrollState())
        ) {
            //CARD1
            Card {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_14),
                        contentDescription = "",
                        modifier = Modifier.size(180.dp)
                    )

                    Text(text = "Name : Pearl Necklace", fontSize = 15.sp)
                    Text(text = "origin : India ", fontSize = 15.sp)
                    Text(text = "price : ksh.13,456", fontSize = 15.sp)
                    Button(
                        onClick = {
                            val simToolKitLauncherIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                        },
                        colors = androidx.compose.material.ButtonDefaults.buttonColors(Color.Green),
                        shape = RectangleShape
                    ) {
                        Text(text = "Buy")

                    }

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            //CARD2

            Card {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_19),
                        contentDescription = "",
                        modifier = Modifier.size(180.dp)
                    )

                    Text(text = "Name : Designer Jewelry", fontSize = 15.sp)
                    Text(text = "origin : Turkey ", fontSize = 15.sp)
                    Text(text = "price : ksh.18,999", fontSize = 15.sp)
                    Button(
                        onClick = {
                            val simToolKitLauncherIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLauncherIntent?.let { mContext.startActivity(it) }
                        },
                      colors = androidx.compose.material.ButtonDefaults.buttonColors(Color.Green),
                        shape = RectangleShape
                    ) {
                        Text(text = "Buy")

                    }

                }

            }
        }
            //Row4
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                //First card
                Card(modifier = Modifier.size(200.dp)) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.img_16),
                            contentDescription = "",
                            modifier = Modifier
                                .size(150.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        androidx.compose.material3.Text(
                            text = "designernecklace",
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
                        modifier = Modifier
                            .padding(10.dp)
                            .clip(shape = CircleShape),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_13),
                            contentDescription = "",
                            modifier = Modifier
                                .size(150.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        androidx.compose.material3.Text(
                            text = "oxidised",
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
                        modifier = Modifier
                            .padding(10.dp)
                            .clip(shape = CircleShape),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_13),
                            contentDescription = "",
                            modifier = Modifier
                                .size(150.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        androidx.compose.material3.Text(
                            text = "bridal",
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
                            modifier = Modifier
                                .size(150.dp)
                                .clip(shape = CircleShape),
                            contentScale = ContentScale.Crop
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



    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())

}

