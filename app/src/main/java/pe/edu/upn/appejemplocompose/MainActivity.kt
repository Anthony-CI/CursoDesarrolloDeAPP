package pe.edu.upn.appejemplocompose

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.upn.appejemplocompose.ui.theme.AppEjemploComposeTheme


/*
Android Studio Ladybug Feature Drop | 2024.2.2
Build #AI-242.23726.103.2422.12816248, built on December 17, 2024
Runtime version: 21.0.4+-12508038-b607.1 amd64
VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
Toolkit: sun.awt.windows.WToolkit
Windows 10.0
GC: G1 Young Generation, G1 Concurrent GC, G1 Old Generation
Memory: 4058M
Cores: 20
Registry:
  ide.experimental.ui=true
  i18n.locale=
Non-Bundled Plugins:
  Dart (242.24931)
  io.flutter (83.0.3)

Por el momento levanta en una version actual sin nesecidad
de tener la del laboratorio
 */


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
           AppInicio()
        }
    }
}

@Composable
fun AppInicio(){
    Surface(

        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
       Mensaje()

    }
}
@Composable
fun Mensaje(){
    val contexto= LocalContext.current
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Bienvenidos al ciclo 2025-1",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(15.dp)
        )
        Text(
            text = "Ingenieria de sistemas Computacionales",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(
            modifier = Modifier.height(15.dp)
        )
        Image(
            painter = painterResource(R.drawable.logoupn),
            contentDescription = "logo",
            modifier = Modifier

        )
        Spacer(
            modifier = Modifier.height(15.dp)
        )

        Button(
            onClick = {
                //codigo fuente evento click
                Toast.makeText(contexto,"Abrir calculadora",
                    Toast.LENGTH_LONG).show()
                val oIntento = Intent(contexto,ActividadCalculadora::class.java)
                contexto.startActivity(oIntento)
            }
        ) {
            Text(
                text = "Calculadora"
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppEjemploComposeTheme {
        //Greeting("Android")
        AppInicio()
    }
}