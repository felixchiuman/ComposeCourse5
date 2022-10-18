package com.felix.composecourse5

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.felix.composecourse5.ui.theme.ComposeCourse5Theme
import org.junit.Rule
import org.junit.Test

class TipUiTests {

    @get: Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate20PercentTip() {
        composeTestRule.setContent {
            ComposeCourse5Theme {
                TipTimeScreen()
            }
        }
        composeTestRule.onNodeWithText("Cost of Service")
            .performTextInput("10") //buat akses textfield nya cost of service
        composeTestRule.onNodeWithText("Tip (%)")
            .performTextInput("20")
        composeTestRule.onNodeWithText("Tip amount: $2.00").assertExists()
    }
}