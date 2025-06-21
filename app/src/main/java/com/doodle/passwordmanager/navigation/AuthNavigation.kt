package com.doodle.passwordmanager.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.doodle.passwordmanager.ui.theme.PasswordManagerTheme
import kotlinx.serialization.Serializable

@Serializable
object SplashScreen;

@Serializable
object EmailLoginScreen;

@Serializable
object PhoneLoginScreen;

@Serializable
object OTPScreen;

@Composable
fun AuthNavigation() {
    val authNavController: NavHostController = rememberNavController();

    PasswordManagerTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) {
            NavHost(
                navController = authNavController,
                modifier = Modifier.padding(it),
                startDestination = SplashScreen
            ) {
                composable<SplashScreen> {

                }

                composable<EmailLoginScreen> {

                }

                composable<PhoneLoginScreen> {

                }

                composable<OTPScreen> {

                }
            }
        }
    }
}