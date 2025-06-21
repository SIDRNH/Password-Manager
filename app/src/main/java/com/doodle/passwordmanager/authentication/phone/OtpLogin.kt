package com.doodle.passwordmanager.authentication.phone

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.doodle.passwordmanager.ui.theme.PlusJakartaSansFontFamily

@Composable
fun OtpLogin(navController: NavController) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding)
                .padding(top = 72.dp)
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 12.dp),
                text = "Enter OTP",
                textAlign = TextAlign.Center,
                fontFamily = PlusJakartaSansFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            );
            Text(
                modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 12.dp),
                text = "We sent a code to +1 (555) 123-4567",
                textAlign = TextAlign.Center,
                fontFamily = PlusJakartaSansFontFamily,
                fontSize = 16.sp,
                color = Color(0xFF0D141C)
            );
            BasicTextField(
                modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp),
                value = "",
                onValueChange = {},
                singleLine = true,
                decorationBox = {
                    val otpCode = "124456";
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        repeat(6) {index ->
                            OtpBox(otpCode.getOrElse(index) {' '})
                        }
                    }
                }
            );
            Text(
                modifier = Modifier.fillMaxWidth().padding(top = 4.dp, bottom = 12.dp),
                text = "Resend Code",
                textAlign = TextAlign.Start,
                fontFamily = PlusJakartaSansFontFamily,
                fontSize = 14.sp,
                color = Color(0xFF4A739C)
            );
            Button(
                modifier = Modifier.fillMaxWidth()
                    .padding(vertical = 12.dp)
                    .height(48.dp),
                onClick = {},
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF0A80ED)
                ),
                content = {
                    Text(
                        text = "Verify",
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    );
                }
            );
        }
    }
}

@Composable
fun OtpBox(number: Char) {
    Box(
        modifier = Modifier.height(56.dp).width(48.dp)
            .border(1.5.dp, Color(0xFF000000), RoundedCornerShape(12.dp))
            .background(Color(0xFFE8EDF5), RoundedCornerShape(12.dp))
    ) {
        Text(
            text = number.toString(),
            fontFamily = PlusJakartaSansFontFamily,
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.Center)
        );
    }
}

@Preview
@Composable
fun PreviewOtpLogin() {
    OtpLogin(rememberNavController());
}