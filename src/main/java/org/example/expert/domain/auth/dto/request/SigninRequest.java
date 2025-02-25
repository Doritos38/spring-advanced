package org.example.expert.domain.auth.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SigninRequest {
    
    @NotBlank @Email
    private String email;
    @NotBlank
    private String password;

    public int solution(int n) {

        String a = Integer.toString(n,3);
        StringBuilder b = new StringBuilder();
        for(int i=a.length()-1;i>0;i--){
            b.append(a.charAt(i));
        }
        int answer = Integer.parseInt(b.toString(),10);
        System.out.println(answer);
        return answer;
    }
}
