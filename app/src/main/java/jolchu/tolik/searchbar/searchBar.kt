package jolchu.tolik.searchbar

// setContent {
//            var searchText by remember {
//                mutableStateOf("")
//            }
//
//            val mainList = remember {
//                mutableStateOf(Utils.originUsersList)
//            }
//
//            var isActive by remember {
//                mutableStateOf("")
//            }
//
//            SearchBarTheme {
//                Column(modifier = Modifier.fillMaxSize()) {
//
//                }
//                SearchBar(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(10.dp),
//                    query = searchText,
//                    onQueryChange = { text ->
//                        searchText = text
//                    },
//                    onSearch = { text ->
//                        isActive = false.toString()
//                        mainList.value = Utils.search(text)
//                    },
//                    placeholder = {
//                        Text(text = "Search...", color = Color.White)
//                    },
//                    colors = SearchBarDefaults.colors(
//                        containerColor = Color.Black,
//                        inputFieldColors = TextFieldDefaults.colors(
//                            focusedTextColor = Color.White
//                        )
//                    ),
//                    active = false,
//                    onActiveChange = {
//                        isActive = it.toString()
//                    }
//                ) {
//                    LazyColumn() {
//                        items(mainList.value) { item ->
//                            Box(
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                    .padding(10.dp),
//                                contentAlignment = Alignment.Center
//                            ) {
//                                Text(text = item)
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//}
//
//object Utils {
//    val originUsersList = listOf(
//        "Andrey",
//        "Pety",
//        "Manas",
//        "DAALBAEP",
//        "MONEY",
//        "CASH",
//        "GIME ME A LOT OF MONEY",
//        "SUKAA",
//        "SHIT",
//        "BIG ASS"
//    )
//
//    fun search(text: String): List<String> {
//        return originUsersList.filter {
//            it.startsWith(text)
//        }
//    }
//}