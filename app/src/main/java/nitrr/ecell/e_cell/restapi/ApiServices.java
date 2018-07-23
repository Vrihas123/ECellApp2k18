package nitrr.ecell.e_cell.restapi;

import nitrr.ecell.e_cell.model.AboutUsResponse;
import nitrr.ecell.e_cell.model.AuthenticationResponse;
import nitrr.ecell.e_cell.model.UserDetails;
import nitrr.ecell.e_cell.utils.AppConstants;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiServices {

    @POST(AppConstants.SIGN_UP_URL)
    Call<AuthenticationResponse> sendRegisterDetails(@Body UserDetails userDetails);

    @GET(AppConstants.ABOUT_US_URL)
    Call<AboutUsResponse> getAboutUsDetails();

}