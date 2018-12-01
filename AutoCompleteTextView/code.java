String[] myList = {"aop1", "aop2", "aop3", "bop1", "bop2", "bop3"};
ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myList);
AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
autoCompleteTextView.setAdapter(arrayAdapter);
//autoCompleteTextView.setCompletionHint("My Completion Hint");
//autoCompleteTextView.setThreshold(1);
