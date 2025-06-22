package com.doodle.passwordmanager.vault

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.doodle.passwordmanager.R
import com.doodle.passwordmanager.ui.theme.PasswordManagerTheme
import com.doodle.passwordmanager.ui.theme.PlusJakartaSansFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Account(navController: NavController) {
    PasswordManagerTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "Account",
                            fontFamily = PlusJakartaSansFontFamily,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF0D141C)
                        );
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = { /* Handle close */ },
                            content = {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                    contentDescription = "Back"
                                );
                            }
                        );
                    }
                );
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier.fillMaxSize()
                    .padding(innerPadding)
                    .padding(horizontal = 16.dp)
            ) {
                InfoItem(
                    iconResId = R.drawable.user_icon,  // your email icon
                    label = "Email",
                    value = "example@email.com",
                    isPassword = false
                );
                InfoItem(
                    iconResId = R.drawable.password_icon,  // your password icon
                    label = "Password",
                    value = "••••••••",
                    isPassword = true
                );
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 20.dp, bottom = 12.dp),
                    text = "Notes",
                    fontSize = 22.sp,
                    fontFamily = PlusJakartaSansFontFamily,
                    fontWeight = FontWeight.Bold
                );
                Text(
                    modifier = Modifier.fillMaxWidth().padding(top = 4.dp, bottom = 12.dp),
                    text = "This is my personal email account. I use it for all my personal communications and online shopping.",
                    fontSize = 16.sp,
                    fontFamily = PlusJakartaSansFontFamily
                );
                Spacer(modifier = Modifier.weight(1f));
                Row(
                    modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = { /* Copy password */ },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = Color(0xFFE8EDF5),
                            contentColor = Color.Black
                        ),
                        content = {
                            Text(
                                text = "Copy Password",
                                fontFamily = PlusJakartaSansFontFamily,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    );
                    Button(
                        onClick = { /* Edit */ },
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF0D80F2),
                            contentColor = Color.White
                        ),
                        content = {
                            Text(
                                text = "Edit",
                                fontFamily = PlusJakartaSansFontFamily,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            );
                        }
                    );
                };
                Spacer(modifier = Modifier.height(20.dp));
            }
        }
    }
}

@Composable
fun InfoItem(
    @DrawableRes iconResId: Int,
    label: String,
    value: String,
    isPassword: Boolean = false
) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(color = Color(0xFFE8EDF5), shape = RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = label,
                tint = Color.Black
            );
        }
        Spacer(modifier = Modifier.width(16.dp));
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = label,
                fontFamily = PlusJakartaSansFontFamily,
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF0D141C)
            );
            Text(
                text = value,
                fontSize = 14.sp,
                color = Color(0xFF4A739C)
            )
        }
        if (isPassword) {
            IconButton(
                onClick = { /* Handle password visibility toggle */ },
                content = {
                    Icon(
                        painter = painterResource(id = R.drawable.eye_icon),
                        contentDescription = "Toggle Password"
                    );
                }
            );
        }
    }
}

@Preview
@Composable
fun PreviewInfoItem() {
    InfoItem(
        iconResId = R.drawable.user_icon,
        label = "Username",
        value = "john_doe"
    );
}

@Preview//(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewAccount() {
    Account(rememberNavController());
}