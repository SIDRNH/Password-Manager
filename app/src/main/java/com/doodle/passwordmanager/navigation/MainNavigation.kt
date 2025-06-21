package com.doodle.passwordmanager.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.doodle.passwordmanager.R
import com.doodle.passwordmanager.ui.theme.PasswordManagerTheme
import com.doodle.passwordmanager.vault.Vault
import kotlinx.serialization.Serializable

@Serializable
object VaultScreen;

@Serializable
object AddAccountScreen;

@Serializable
object GeneratorScreen;

@Serializable
object Settings;

@Composable
fun MainNavigation() {
    val mainNavController: NavHostController = rememberNavController();
    val currentBackStackEntry: State<NavBackStackEntry?> = mainNavController.currentBackStackEntryAsState()
    val currentRoute: String? = currentBackStackEntry.value?.destination?.route;

    val vaultIcon: Int = if (currentRoute == VaultScreen::class.qualifiedName) R.drawable.vault_selected_icon else R.drawable.vault_icon;
    val generatorIcon: Int = if (currentRoute == GeneratorScreen::class.qualifiedName) R.drawable.generator_selected_icon else R.drawable.generator_icon;

    PasswordManagerTheme {
        Scaffold(
            bottomBar = {
                val showBottomBar: Boolean = currentRoute == VaultScreen::class.qualifiedName || currentRoute == GeneratorScreen::class.qualifiedName;
                if (showBottomBar) {
                    NavigationBar {
                        NavigationBarItem(
                            selected = currentRoute == VaultScreen::class.qualifiedName,
                            onClick = {
                                if (currentRoute != VaultScreen::class.qualifiedName) {
                                    mainNavController.navigate(VaultScreen) {
                                        // Pop up to the start destination to avoid building up a large backstack
                                        popUpTo(mainNavController.graph.startDestinationId) {
                                            saveState = true;// Save state of the popped destination
                                        }
                                        // Avoid multiple copies of the same destination when re-selecting the same item
                                        launchSingleTop = true;
                                        // Restore state when re-selecting a previously selected item
                                        restoreState = true;
                                    }
                                }
                            },
                            label = {
                                Text(
                                    text = "Vault"
                                );
                            },
                            icon = {
                                Icon(
                                    painter = painterResource(id = vaultIcon),
                                    contentDescription = "Vault"
                                )
                            }
                        );
                        NavigationBarItem(
                            selected = currentRoute == GeneratorScreen::class.qualifiedName,
                            onClick = {
                                if (currentRoute != GeneratorScreen::class.qualifiedName) {
                                    mainNavController.navigate(GeneratorScreen) {
                                        popUpTo(mainNavController.graph.startDestinationId) {
                                            saveState = true;
                                        }
                                        launchSingleTop = true;
                                        restoreState = true;
                                    }
                                }
                            },
                            label = {
                                Text(
                                    text = "Generator"
                                );
                            },
                            icon = {
                                Icon(
                                    painter = painterResource(id = generatorIcon),
                                    contentDescription = "password Generator"
                                )
                            }
                        );
                    }
                }
            }
        ) {innerPadding ->
            NavHost(
                navController = mainNavController,
                startDestination = VaultScreen,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable<VaultScreen> {
                    Vault(navController = mainNavController);
                }
                composable<GeneratorScreen> {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("Generator")
                    }
                }
            }
        }
    }
}