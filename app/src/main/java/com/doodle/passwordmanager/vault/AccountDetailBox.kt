package com.doodle.passwordmanager.vault

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.doodle.passwordmanager.R
import com.doodle.passwordmanager.ui.theme.PlusJakartaSansFontFamily

@Composable
fun AccountDetailBox() {
    Box(
        modifier = Modifier.fillMaxWidth()
            .clickable(onClick = {})
    ) {
        Row {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .border(
                        width = 0.dp,
                        color = Color(0xFFE8EDF5),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .background(
                        color = Color(0xFFE8EDF5),
                        shape = RoundedCornerShape(8.dp)
                    ),
                contentAlignment = Alignment.Center
            ){
                Icon(
                    painter = painterResource(id = R.drawable.web_account_icon),
                    contentDescription = "Account Icon"
                )
            }
            Spacer(modifier = Modifier.width(16.dp));
            Column {
                Text(
                    text = "google.com",
                    fontFamily = PlusJakartaSansFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    color = Color(0xFF0D141C)
                );
                Text(
                    text = "sid@gamil.com",
                    fontFamily = PlusJakartaSansFontFamily,
                    fontSize = 14.sp,
                    color = Color(0xFF4A739C)
                );
            }
        }
    }
}

@Preview
@Composable
fun PreviewAccountDetailBox() {
    AccountDetailBox();
}