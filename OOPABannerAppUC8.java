public static HashMap<Character, String[]> createCharacterMap() {
    HashMap<Character, String[]> charMap = new HashMap<>();

    // Pattern for 'O'
    charMap.put('O', new String[]{
        " ***** ",
        "*     *",
        "*     *",
        "*     *",
        " ***** "
    });

    // Pattern for second 'O' (same as first)
    charMap.put('0', new String[]{   // if you want digit zero separately
        " ***** ",
        "*     *",
        "*     *",
        "*     *",
        " ***** "
    });

    // Pattern for 'P'
    charMap.put('P', new String[]{
        "***** ",
        "*    *",
        "***** ",
        "*     ",
        "*     "
    });

    // Pattern for 'S'
    charMap.put('S', new String[]{
        " *****",
        "*     ",
        " *****",
        "     *",
        " *****"
    });

    return charMap;
}
