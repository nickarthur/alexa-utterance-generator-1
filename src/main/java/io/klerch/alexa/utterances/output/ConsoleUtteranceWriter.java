package io.klerch.alexa.utterances.output;

public class ConsoleUtteranceWriter implements UtteranceWriter {
    private Integer i = 0;

    @Override
    public void beforeWrite() {}

    @Override
    public void write(String utterance) {
        System.out.println(utterance);
        i += 1;
    }

    @Override
    public void afterWrite() {
        System.out.println("Generated " + i + " utterances.");
    }
}
