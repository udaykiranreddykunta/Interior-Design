package com.example.myproject.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myproject.R
import com.example.myproject.components.HeadingTextComponent
import com.example.myproject.components.NormalTextComponent
import com.example.myproject.navigation.AppRouter
import com.example.myproject.navigation.Screen
import com.example.myproject.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionsScreen() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)) {

        HeadingTextComponent(value = stringResource(id = R.string.terms_and_conditions_header))
        }
    NormalTextComponent(value = stringResource(id = R.string.terms_and_conditions_headerdes))

    SystemBackButtonHandler {
        AppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun TermsAndConditionsScreenPreview(){
    TermsAndConditionsScreen()
}