
package ir.calendar.kotlincource.kotlincodes.retrofit;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repo {

    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("tooltips")
    @Expose
    private Tooltips tooltips;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Tooltips getTooltips() {
        return tooltips;
    }

    public void setTooltips(Tooltips tooltips) {
        this.tooltips = tooltips;
    }

}
