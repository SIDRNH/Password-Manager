package com.doodle.passwordmanager.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.doodle.passwordmanager.R
import com.doodle.passwordmanager.ui.theme.PasswordManagerTheme
import com.doodle.passwordmanager.ui.theme.PlusJakartaSansFontFamily

@Composable
fun Splash(navController: NavController) {
    PasswordManagerTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier.fillMaxSize().padding(it),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier.weight(1f).fillMaxSize()
                ) {
                    Image(
                        modifier = Modifier.fillMaxWidth().height(320.dp),
                        painter = painterResource(id = R.drawable.splash_image),
                        contentDescription = stringResource(R.string.splash_image),
                    );
                    Text(
                        modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, top = 20.dp, bottom = 12.dp),
                        text = stringResource(R.string.splash_heading),
                        fontSize = 28.sp,
                        fontFamily = PlusJakartaSansFontFamily,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    );
                    Text(
                        modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 12.dp),
                        text = stringResource(R.string.splash_body),
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center
                    );
                }
                Button(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF0D80F2)
                    ),
                    onClick = {},
                    content = {
                        Text(text = "Get Started");
                    }
                );
            };
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewSplash() {
    Splash(rememberNavController());
}