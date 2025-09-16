package com.likelion.likelionSwagger.post.api;

import com.likelion.likelionSwagger.common.error.SuccessCode;
import com.likelion.likelionSwagger.common.template.ApiResTemplate;
import com.likelion.likelionSwagger.post.api.dto.request.PostSaveRequestDto;
import com.likelion.likelionSwagger.post.application.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
public class PostController implements PostApi {

    private final PostService postService;

    @Override
    public ApiResTemplate<String> postSave(PostSaveRequestDto postSaveRequestDto, Principal principal) {
        postService.postSave(postSaveRequestDto, principal);
        return ApiResTemplate.successWithNoContent(SuccessCode.POST_SAVE_SUCCESS);
    }
}
