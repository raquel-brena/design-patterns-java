package org.example;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HeroFactory {

    private final Beast beast;

    public Beast createBeast() {
        return (Beast) beast.clone();
    }
}
