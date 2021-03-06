package com.inschos.cloud.account.access.http.controller.bean;

import com.inschos.cloud.account.annotation.ParamCheckAnnotation;

import java.util.List;

/**
 * Created by IceAnt on 2018/3/23.
 */
public class AccountBean {

    public static class LoginRequest extends BaseRequest{

        @ParamCheckAnnotation(name = "用户名",isCheckEmpty = true)
        public String username;

        @ParamCheckAnnotation(name = "密码",isCheckEmpty = true)
        public String password ;

        @ParamCheckAnnotation(name = "登录方式",isCheckEmpty = true)
        public String method ;

    }

    public static class LoginResponse extends BaseResponse{

        public TokenData data;
    }

    public static class RegistryRequest extends BaseRequest{

        @ParamCheckAnnotation(name = "用户名",isCheckEmpty = true,isCheckMinLength = 6,isCheckMaxLength = 20)
        public String username;

        @ParamCheckAnnotation(name = "密码",isCheckEmpty = true,isCheckMinLength = 6,isCheckMaxLength = 20)
        public String password;

        @ParamCheckAnnotation(name = "注册方式",isCheckEmpty = true)
        public String method ;

//        @ParamCheckAnnotation(name = "验证码",isCheckEmpty = true)
//        public String code;
//
//        @ParamCheckAnnotation(name = "手机号",isCheckEmpty = true,isCheckMinLength = 11,isCheckMaxLength = 11)
//        public String phone;
//
//        @ParamCheckAnnotation(name = "邮箱地址",isCheckEmpty = true,isCheckMinLength = 5,isCheckMaxLength = 64)
//        public String email;

        @ParamCheckAnnotation(name = "验证",isCheckEmpty = true)
        public String verifyToken;
        // TODO: 2018/7/29 业管开通账号时  需要填写域名

        public String domain;
    }


    public static class RegistryResponse extends BaseResponse{

        public RegistrySuccessData data;
    }

    public static class GetCodeRequest extends BaseRequest{

        public String phone;

        public String email;

        @ParamCheckAnnotation(name = "验证方式",isCheckEmpty = true)
        public String method;

    }

    public static class GetCodeResponse extends BaseResponse{

//        public VerifyTokenData data;

    }

    public static class CheckCodeRequest extends BaseRequest{

        public String phone;

        public String email;

        @ParamCheckAnnotation(name = "验证方式",isCheckEmpty = true)
        public String method;

        @ParamCheckAnnotation(name = "验证码",isCheckEmpty = true)
        public String code;

    }

    public static class CheckCodeResponse extends BaseResponse{

        public VerifyTokenData data;

    }

    public static class ChooseManagerRequest extends BaseRequest{

        @ParamCheckAnnotation(name = "企业ID",isCheckEmpty = true)
        public String managerUuid;
    }

    public static class ChooseManagerResponse extends BaseResponse{
        public TokenData data;
    }

    public static class ListManagerRequest extends BaseRequest{

    }

    public static class ListManagerResponse extends BaseResponse{
        public List<ManagerData> data;
    }




    public static class ModifyPasswordRequest extends BaseRequest{

        @ParamCheckAnnotation(name = "原密码",isCheckEmpty = true)
        public String oldpsword;

        @ParamCheckAnnotation(name = "新密码",isCheckEmpty = true,isCheckMinLength = 6,isCheckMaxLength = 20)
        public String password;

    }

    public static class ModifyPasswordResponse extends BaseResponse{

        public TokenData data;
    }

    public static class ChangePhoneEmailRequest extends BaseRequest{
//        @ParamCheckAnnotation(name = "手机号",isCheckEmpty = true,isCheckMinLength = 11,isCheckMaxLength = 11)
//        public String phone;
//
//        @ParamCheckAnnotation(name = "邮箱地址",isCheckEmpty = true,isCheckMinLength = 5,isCheckMaxLength = 64)
//        public String email;

//        @ParamCheckAnnotation(name = "验证码",isCheckEmpty = true)
//        public String code;

        @ParamCheckAnnotation(name = "验证",isCheckEmpty = true)
        public String verifyToken;
    }


    public static class ResetPasswordRequest extends BaseRequest{


        @ParamCheckAnnotation(name = "密码",isCheckEmpty = true,isCheckMinLength = 6,isCheckMaxLength = 20)
        public String password;

//        @ParamCheckAnnotation(name = "验证码",isCheckEmpty = true)
//        public String code;
//
//        @ParamCheckAnnotation(name = "手机号",isCheckEmpty = true,isCheckMinLength = 11,isCheckMaxLength = 11)
//        public String phone;
//
//        @ParamCheckAnnotation(name = "邮件地址",isCheckEmpty = true,isCheckMinLength = 5,isCheckMaxLength = 64)
//        public String email;

        @ParamCheckAnnotation(name = "验证",isCheckEmpty = true)
        public String verifyToken;

    }


    public static class ResetPasswordResponse extends BaseResponse{
        public TokenData data;
    }

    public static class ForgetPasswordRequest extends BaseRequest{


        @ParamCheckAnnotation(name = "密码",isCheckEmpty = true,isCheckMinLength = 6,isCheckMaxLength = 20)
        public String password;

//        @ParamCheckAnnotation(name = "验证码",isCheckEmpty = true)
//        public String code;
//
//        @ParamCheckAnnotation(name = "手机号",isCheckEmpty = true,isCheckMinLength = 11,isCheckMaxLength = 11)
//        public String phone;
//
//        @ParamCheckAnnotation(name = "邮件地址",isCheckEmpty = true,isCheckMinLength = 5,isCheckMaxLength = 64)
//        public String email;

        @ParamCheckAnnotation(name = "验证",isCheckEmpty = true)
        public String verifyToken;

    }

    public static class JointLoginRequest{
        @ParamCheckAnnotation(name = "平台",isCheckEmpty = true)
        public String platform;
        @ParamCheckAnnotation(name = "账号来源",isCheckEmpty = true)
        public String origin;
        public String name;
        public String phone;
        public String certType;
        public String certCode;
        public String email;
        public String province;
        public String city;
        public String district;
        public String address;



    }

    public static class TokenData {

        public String token;

        public String accountUuid;

        public String managerUuid;

        public String userId;

        public int userType;


    }

    public static class HomeData{

        public String compName;

        public String compLogo;
    }

    public static class VerifyTokenData{

        public String verifyToken;

    }

    public static class RegistrySuccessData{

        public String usernameTxt;

        public String passwordTxt;
    }

    public static class ManagerData{
        public String managerUuid;
        public String managerName;
    }



}
