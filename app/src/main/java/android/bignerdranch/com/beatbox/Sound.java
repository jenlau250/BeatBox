package android.bignerdranch.com.beatbox;

public class Sound {
    private String mAssetPath;
    private String mName;
    //}
    //By making mSoundId an Integer instead of an int, you make it possible to say that a Sound has no
    //value set for mSoundId by assigning it a null value.
    private Integer mSoundId;

    public Sound(String assetPath) {
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer SoundId) {
        this.mSoundId = SoundId;
    }
}
