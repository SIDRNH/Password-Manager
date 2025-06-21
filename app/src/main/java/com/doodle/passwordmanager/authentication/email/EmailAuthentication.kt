package com.doodle.passwordmanager.authentication.email

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
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
import com.doodle.passwordmanager.ui.theme.PasswordManagerTheme
import com.doodle.passwordmanager.ui.theme.PlusJakartaSansFontFamily

@Composable
fun EMailAuthentication(navController: NavController) {
    PasswordManagerTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding).padding(top = 72.dp).padding(horizontal = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 12.dp),
                    text = "Login to your Account",
                    textAlign = TextAlign.Center,
                    fontFamily = PlusJakartaSansFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                );
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp),
                    value = "",
                    onValueChange = {},
                    label = { Text(
                        text = "Email",
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 16.sp
                    ) },
                    shape = RoundedCornerShape(12.dp)
                );
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp),
                    value = "",
                    onValueChange = {},
                    label = { Text(
                        text = "Password",
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 16.sp
                    ) },
                    shape = RoundedCornerShape(12.dp)
                );
                Text(
                    modifier = Modifier.fillMaxWidth()
                        .clickable(
                            onClick = {}
                        ),
                    text = "Forgot Password?",
                    fontFamily = PlusJakartaSansFontFamily,
                    fontSize = 14.sp
                );
                Button(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp).height(48.dp),
                    onClick = {},
                    content = {
                        Text(
                            text = "Login",
                            fontFamily = PlusJakartaSansFontFamily,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        );
                    },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFDBE8F2),
                        contentColor = Color(0xFF0F1417)
                    )
                );
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "or Login with",
                    textAlign = TextAlign.Center,
                    fontFamily = PlusJakartaSansFontFamily,
                    fontSize = 14.sp
                );
                Button(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp).height(48.dp),
                    onClick = {},
                    content = {
                        Text(
                            text = "Phone Number",
                            fontFamily = PlusJakartaSansFontFamily,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        );
                    },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFEBEDF2),
                        contentColor = Color(0xFF0F1417)
                    )
                );
            }
        }
    }
}

@Preview@Composable
fun PreviewEMailAuthentication() {
    EMailAuthentication(rememberNavController());
}