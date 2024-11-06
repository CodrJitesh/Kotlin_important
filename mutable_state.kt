@Composable
fun HelloContent() {
    Column(modifier = Modifier.padding(16.dp)) {
        var name by remember { mutableStateOf("") } // the by keyword is used so the name directly stores the value (no need for name.value)
        if (name.isNotEmpty()) {
            Text(
                text = "Hello, $name!",
                modifier = Modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
        OutlinedTextField( // used to create a textbox for user input
            value = name,
            onValueChange = { name = it },   // when the value changes, assign it(the new value) to name
            label = { Text("Name") }
        )
    }
}
