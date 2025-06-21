package com.doodle.passwordmanager.authentication.masterpassword

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.doodle.passwordmanager.ui.theme.PlusJakartaSansFontFamily

@Composable
fun MasterPassword(navController: NavController) {
    Scaffold(
        modifier = Modifier.fillMaxWidth()
    ) {innerPadding ->
        Box(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding)
                .padding(top = 72.dp)
                .padding(horizontal = 16.dp),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = "Create a Master Password",
                    fontFamily = PlusJakartaSansFontFamily,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                );
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 4.dp),
                    text = "This password will be used to unlock your vault. It should be strong and memorable.",
                    fontFamily = PlusJakartaSansFontFamily,
                    fontSize = 16.sp
                );
                Column(
                    modifier = Modifier.padding(top = 12.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        modifier = Modifier.padding(),
                        text = "Master Password",
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF0D141C)
                    );
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        placeholder = { Text(
                            text = "Enter Password",
                            fontFamily = PlusJakartaSansFontFamily,
                            fontSize = 16.sp,
                            color = Color(0xFF4A739C)
                        ) },
                        shape = RoundedCornerShape(12.dp),
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedContainerColor = Color(0xFFE8EDF5),
                            unfocusedContainerColor = Color(0xFFE8EDF5),
                        )
                    );
                }
                Column(
                    modifier = Modifier.padding(top = 12.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = "Confirm Password",
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF0D141C)
                    );
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        placeholder = { Text(
                            text = "Re-enter Password",
                            fontFamily = PlusJakartaSansFontFamily,
                            fontSize = 16.sp,
                            color = Color(0xFF4A739C)
                        ) },
                        shape = RoundedCornerShape(12.dp),
                        colors = TextFieldDefaults.colors(
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedContainerColor = Color(0xFFE8EDF5),
                            unfocusedContainerColor = Color(0xFFE8EDF5),
                        )
                    );
                }
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = "Password Strength: {Weak}",
                    fontFamily = PlusJakartaSansFontFamily,
                    fontSize = 14.sp,
                    color = Color(0xFF4A739C)
                );
            }
            Button(
                modifier = Modifier.fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 20.dp)
                    .padding(vertical = 12.dp)
                    .height(48.dp),
                onClick = {},
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF0D80F2),
                    contentColor = Color(0xFFF7FAFC)
                ),
                content = {
                    Text(
                        text = "Continue",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            );
        }
    }
}

@Preview
@Composable
fun PreviewMasterPassword() {
    MasterPassword(rememberNavController());
}