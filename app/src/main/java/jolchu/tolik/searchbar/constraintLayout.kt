package jolchu.tolik.searchbar

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
//        val (text, button, image) = createRefs()
//        val bottomGuideLine = createGuidelineFromBottom(0.2f)
//
//        Button(onClick = {},
//            modifier = Modifier.constrainAs(button) {
//                bottom.linkTo(bottomGuideLine)
//                top.linkTo(bottomGuideLine)
//                end.linkTo(parent.end)
//                start.linkTo(parent.start)
//            }
//        )
//        {
//            Text(text = "Click me")
//        }
//        Text(text = "Hello World",
//            modifier = Modifier.constrainAs(text) {
//                bottom.linkTo(button.bottom, 16.dp)
//                start.linkTo(button.start, 16.dp)
//                end.linkTo(button.end, 16.dp)
//            })
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_background),
//            contentDescription = "img",
//            modifier = Modifier.constrainAs(image) {
//                bottom.linkTo(button.bottom, 16.dp)
//                start.linkTo(button.start, 16.dp)
//                end.linkTo(button.end, 16.dp)
//            }
//        )
//    }
//
//}