package com.example.dell.miwok;

public class Word {
    private static final int NO_IMAGE = -1;
    private String mDefaultWord;
    private int mImageResourceId = -1;
    private String mMiwokWord;
    private int audioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        this.mDefaultWord = defaultTranslation;
        this.mMiwokWord = miwokTranslation;
        this.audioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        this.mDefaultWord = defaultTranslation;
        this.mMiwokWord = miwokTranslation;
        this.mImageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() {
        return this.mDefaultWord;
    }

    public String getMiwokTranslation() {
        return this.mMiwokWord;
    }

    public int getmImageResourceId() {
        return this.mImageResourceId;
    }

    public boolean hasImage() {
        return this.mImageResourceId != -1;
    }

    public int getAudioResourceId() {
        return this.audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultWord='" + mDefaultWord + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mMiwokWord='" + mMiwokWord + '\'' +
                ", audioResourceId=" + audioResourceId +
                '}';
    }
}
