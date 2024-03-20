package mobi.ross.jpicnic.domain;

record LoginResult (
    String UserId,                              //`json:"user_id"`
    String SecondFactorAuthenticationRequired,  //`json:"second_factor_authentication_required"`
    String AuthKey                             //`json:"auth_key"`
){}
