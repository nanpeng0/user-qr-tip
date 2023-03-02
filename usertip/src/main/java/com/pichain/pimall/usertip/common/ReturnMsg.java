package com.pichain.pimall.usertip.common;


public interface ReturnMsg {
    /**
     * 公共返回 code=0***
     */
    public interface common {
        String SUCCESS_CODE = "0000";
        String FAIL_CODE = "0001";
        String MAIL_CODE_ERR = "0002";
        String SEND_MAIL_CODE_FAIL = "0003";
        String LOCK_LOCKED="0004";
		String NON_PICTURE="0005";
		String SKU_NON_EXIST = "0006";//商品不存在
    }

    /**
     * 用户相关返回 code=1***
     */
    interface user {
        String TOKEN_NULL_CODE = "1000";
        String TOKEN_EXPIRES_CODE = "1001";
        String TOKEN_ERROR_CODE = "1002";
        String METHOD_ERROR_CODE = "1003";
        String AUTH_NULL_CODE = "1004";
        String TIMESTAMP_NULL_CODE = "1005";
        String AUTH_ERR_CODE = "1006";
        String REPEAT_CLICK_CODE = "1007";
        String ACCOUNT_FREEZE = "1016";
        String SUPERIOR_NAME_NOT_EXIET = "1017";
        String NICK_NAME_EXIET = "1018";
        String NICK_NAME_ERROR_CHAR = "1019";
        String ACCESS_TOKEN_NULL_CODE = "1020";

        interface register {
            String REGISTER_ACCOUNT_EMPTY_CODE = "1008";
            String REGISTER_MAIL_EMPTY_CODE = "1009";
            String REGISTER_MAILCODE_EMPTY_CODE = "1010";
            String REGISTER_REAPEAT_ERR_CODE = "1011";
            String REGISTER_ACCOUNT_EXIST_CODE = "1012";
            String REGISTER_PASSWORD_EMPTY = "1013";
            String REGISTER_LOGIN_FAIL = "1014";
            String NO_REGISTER_CODE = "1015";
        }

    }

    /**
     * 商品相关
     */
    interface Commodity {
        String COMMODITY_OUT_STOCK = "2000";
        String ODERS_STATUS_CHANGE = "2001";
        String BALANCE_NOT_ENOUGH = "2002";
        String ORDERS_NOT_EMPTY = "2003";
        String ORDERS_STATUS_NOT_FIVE = "2004";
        String ORDERS_STATUS_NOT_TWO = "2005";
        String ORDERS_STATUS_NOT_NINE = "2006";
        String COMMODITY_BALANCE_CHANGE = "2007";
        String ORDERS_STATUS_NOT_SIX = "2008";
        String COMMODITY_NUM_MIN_ZERO = "2009";
        String ORDER_REPEAT = "2010";
        String COMMENT_DELETE_ERR = "2011";
        String COMMENT_BE_SHIELD = "2012";
        String ORDER_EVALUATION_STATUS_ERR = "2013";
        String COMMODITY_TO_BE_REVIEWED = "2014";
        String PROHIBIT_CREATE_COMMODITY="2015";
        String COUNTYR_NO_PEACH="2016";
        String COUNTYR_NO_BY_PEACH="2017";
        String CANT_REFUND="2018";
        String AFTER_SALE_EXIST="2019";
        String AFTER_SALE_NULL="2020";
		String PICTURE_URL_OUTER="2021";
		String ORDERS_STATUS_NOT_THREE = "2022";
    }

    /**
     * 钱包相关
     */
    interface wallet {
        String WALLET_PAYMENT_FAILED = "3000";
        String PAYMENT_PASSWORD_ERR = "3001";
        String PAYMENT_PASSWORD_NUL = "3002";
        String HAVE_NO_COMPLATE_ORDER = "3003";
        String RECHARGR_STATUS_ERR = "3004";
        String INSUFFICIENT_ACCOUNT_BALANCE = "3005";
        String BLOCKCHIAN_ADDRESS_IS_NULL = "3006";
    }

	/**
	 * 库存相关
	 */
	interface stock {
		String LOCK_FAIL = "4000";//获取锁失败
		String STOCK_EMPTY = "4003";//库存不足
	}

	/**
	 * 收藏表
	 */
	interface collect{
		String COLLECT_PRODUCT_ID = "product_id";
		String COLLECT_USER_ID = "user_id";

		String STATUS = "status";
	}

}
