package com.example.questadvancelayout_015

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Praktikum3(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2C2F33)) // Warna gelap seperti di foto
            .padding(top = 50.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Foto Profil
        val gambar = painterResource(id = R.drawable.bebek_edit)
        Image(
            painter = gambar,
            contentDescription = null,
            modifier = Modifier
                .size(155.dp)
                .background(Color.White, shape = CircleShape)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(5.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            SocialMediaIcon(icon = painterResource(id = R.drawable.instagram))
            SocialMediaIcon(icon = painterResource(id = R.drawable.linkedin))
            SocialMediaIcon(icon = painterResource(id = R.drawable.gmail))
            SocialMediaIcon(icon = painterResource(id = R.drawable.x))
        }

        Spacer(modifier = Modifier.height(5.dp))

        // Nama & Username
        Text(
            text = "Ifa Asmarani",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(
            text = "@ifaasmarani",
            fontSize = 16.sp,
            color = Color.LightGray
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Deskripsi
        Text(
            text = "Back End Developer",
            fontSize = 16.sp,
            color = Color.White,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(30.dp))

