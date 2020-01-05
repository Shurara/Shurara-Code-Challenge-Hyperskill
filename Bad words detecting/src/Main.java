public static Stream<String> createBadWordsDetectingStream(String text, List<String> badWords){

        List<String> allWords= Arrays.asList(text.split(" "));


        List<String> foundedWords = allWords.stream().filter(word->badWords.contains(word))
        .distinct()
        .sorted()
        .collect(Collectors.toList());

        return foundedWords.stream();

        }