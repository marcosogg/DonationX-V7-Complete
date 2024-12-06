package ie.setu.donationx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import ie.setu.donationx.ui.screens.home.HomeScreen
import ie.setu.donationx.ui.theme.DonationXTheme

@AndroidEntryPoint
class DonationXMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DonationXTheme { HomeScreen() }
        }
    }
}
