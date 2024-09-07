package com.example.globalstats.entities;

public class Language {
    private int languageId;
    private String language;
    private boolean isOfficial;

    // Getters and Setters
    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isOfficial() {
        return isOfficial;
    }

    public void setOfficial(boolean isOfficial) {
        this.isOfficial = isOfficial;
    }
}
