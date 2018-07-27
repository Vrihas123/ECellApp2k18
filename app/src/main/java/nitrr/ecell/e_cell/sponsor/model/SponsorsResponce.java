package nitrr.ecell.e_cell.sponsor.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SponsorsResponce implements Serializable{

@SerializedName("success")
    @Expose
    private String success;

@SerializedName("message")
    @Expose
    private  String message;

@SerializedName("spons")
@Expose
private ArrayList<SponsorType> sponsors;

    public String getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public List<SponsorType> getSponsors() {
        return sponsors;
    }
}
