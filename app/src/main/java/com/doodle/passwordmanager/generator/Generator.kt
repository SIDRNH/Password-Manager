package com.doodle.passwordmanager.generator

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.doodle.passwordmanager.R
import com.doodle.passwordmanager.ui.theme.PlusJakartaSansFontFamily

const val MIN_PASSWORD_LENGTH = 4
const val MAX_PASSWORD_LENGTH = 32
const val DEFAULT_PASSWORD_LENGTH = 12

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Generator(navController: NavController) {
    var passwordLength: Int by remember { mutableIntStateOf(DEFAULT_PASSWORD_LENGTH) }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Password Generator",
                        fontFamily = PlusJakartaSansFontFamily,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    );
                },
                actions = {
                    IconButton(
                        onClick = {},
                        content = {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = "Settings"
                            );
                        }
                    )
                }
            )
        }
    ) {innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp),
                value = "",
                onValueChange = {},
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedContainerColor = Color(0xFFE8EDF5),
                    unfocusedContainerColor = Color(0xFFE8EDF5)
                ),
                readOnly = true,
                trailingIcon = {
                    IconButton(
                        onClick = {},
                        content = {
                            Icon(
                                painter = painterResource(id = R.drawable.copy_icon),
                                contentDescription = "Copy"
                            )
                        }
                    )
                }
            );
            Text(
                modifier = Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 8.dp),
                text = "Password Length",
                fontFamily = PlusJakartaSansFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            );
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Characters",
                    fontFamily = PlusJakartaSansFontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                );
                Text(
                    text = "$passwordLength",
                    fontFamily = PlusJakartaSansFontFamily,
                    fontSize = 14.sp
                )
            };
            Slider(
                modifier = Modifier.fillMaxWidth(),
                value = passwordLength.toFloat(),
                onValueChange = {newValue ->
                    passwordLength = newValue.toInt()
                },
                valueRange = MIN_PASSWORD_LENGTH.toFloat()..MAX_PASSWORD_LENGTH.toFloat(),
                steps = MAX_PASSWORD_LENGTH - MIN_PASSWORD_LENGTH - 1,
                // Custom thumb
                thumb = {
                    SliderDefaults.Thumb(
                        interactionSource = remember { MutableInteractionSource() },
                        modifier = Modifier.offset(y = (1.6).dp),
                        thumbSize = DpSize(12.dp, 12.dp),
                        colors = SliderDefaults.colors(
                            thumbColor = Color(0xFF0D80F2)
                        )
                    )
                },
                //Custom Track
                track = {sliderState ->
                    SliderDefaults.Track(
                        modifier = Modifier.height(4.dp),
                        sliderState = sliderState,
                        colors = SliderDefaults.colors(
                            activeTrackColor = Color(0xFF0D80F2),
                            inactiveTrackColor = Color(0xFFCFDBE8),
                            activeTickColor = Color.Transparent, // No visible ticks for this design
                            inactiveTickColor = Color.Transparent
                        )
                    )
                }
            )
        }
    }
}

@Preview
@Composable
fun PreviewGenerator() {
    Generator(rememberNavController());
}