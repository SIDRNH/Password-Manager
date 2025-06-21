package com.doodle.passwordmanager.authentication.phone

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
fun PhoneAuthentication(navController: NavController) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding)
                .padding(top = 72.dp)
                .padding(horizontal = 16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
                    .weight(1f)
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 12.dp),
                    text = "Phone Number Login",
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
                        text = "Phone Number",
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 16.sp
                    ) },
                    shape = RoundedCornerShape(12.dp)
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
                        containerColor = Color(0xFF0A80ED)
                    )
                );
            }
            Text(
                modifier = Modifier.padding(bottom = 32.dp),
                text = "By continuing, you agree to our Terms of Service and Privacy Policy.",
                textAlign = TextAlign.Center,
                color = Color(0xFF4A739C),
                fontFamily = PlusJakartaSansFontFamily,
                fontSize = 14.sp
            )
        }
    }
}

@Preview
@Composable
fun PreviewPhoneAuthentication() {
    PhoneAuthentication(rememberNavController())
}