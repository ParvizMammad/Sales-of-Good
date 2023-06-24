package com.example.salesofgoodorder.controller;


import com.example.salesofgoodorder.auth.*;
//import com.example.salesofgoodorder.clienatAuth.OAuthTokenResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth/order")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;



    @PostMapping("/registers")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }


    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success Authentication",
                    content = { @Content}),
            @ApiResponse(responseCode = "400", description = "Failed Authentication",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Failed Authentication",
                    content = @Content) })
    @PostMapping("/authenticates")
    @Operation(summary = "My endpoint", security = @SecurityRequirement(name = "bearerAuths"))

    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));


    }

//    @GetMapping("/endpoint")
//    public String handleRequest(String ) {
//        String token = "buraya_tokeninizi_ekleyin";
//        String url = "birinci_microservis_url"; // Birinci mikro servisin URL'sini buraya ekleyin
//
//        String response = HttpRequestExample.sendGetRequest(url, token);
//
//        // İşlemlerinizi burada gerçekleştirin
//        // Birinci mikro servisten gelen yanıtı kullanarak ilgili işlemleri yapın
//
//        return "İkinci mikro servis tarafından dönen yanıt: " + response;
//    }


}
