package com.pichain.pimall.usertip.common;

/**
 * 此处存储的是常量
 */
public interface Constant {

    /**
     * 公共
     */
    interface Common {
        String CREATE_TIME = "create_time";
        String COMMON_TYPE = "type";
        String ORDER_ID="order_id";
        String ORDER_NO="order_no";

    }


    interface Search {
        String GLOABLE_CODE = "globle8787";//全球
        String HOME_COUNTRY = "homecountry8787";//本国
    }

    /**
     * redis相关
     */
    interface redis {
        String REGISTER_MAIL_CODE = "_register"; //用户注册邮箱验证码
        Integer MAIL_CODE_EXPIRE = 180;
    }

    /**
     * user表
     */
    interface User {
        String TABLE_USER_NAME = "user_name";
        String TABLE_USER_PASSWORD = "password";
        String SUPERIOR_ID = "superior_id";
		String USER_EMAIL = "email";
		String ID= "id";
        String USER_ID = "user_id";
    }

    /**
     * 语言表
     */
    interface Language {
        String LANGUAGE_NAME = "language_name";
        String LANGUAGE_KEY_ENGLISH = "english";//语言key英语
        String LANGUAGE_KEY_CHINA_SIMPLE = "china_simple";//语言key中文简体
        String LANGUAGE_LEVEL = "level";
        String PARENT_ID = "parent_id";
    }

    /**
     * 商品图片表
     */
    interface CommodityPictureUrl {
        String URL_COMMODITY_ID = "commodity_id";//商品表主键id
        String URL_SORT = "sort";
		String ID = "ID";
    }

    /**
     * 商品表
     */
    interface Commodity {
        String COMMODITY_ID = "id";
        String COMMODITY_ID_COPY = "id_copy";
        String COMMODITY_STATUS = "status";
        String COMMODITY_USER_ID = "user_id";
        String LOCAL_COUNTRY_ID = "local_country_id";
        String COMMODITY_TITLE = "title";
        String CLASSIFICATION_ID = "classification_id";
        String COUNTRYJSON = "country_json";
        String SIZEJSON = "size_json";

    }

    /**
     * 商品评论
     */
    interface CommodityComment {
        String COMMENT_ID = "id";
        String COMMODITY_COMMENT_ID = "commodity_comment_id";
        String SHIELDED_USER_ID = "shielded_user_id";
        String COMMENT_USER_ID = "user_id";
    }

    /**
     * 订单表
     */
    interface Orders {
        String ORDERS_COMMODITY_ID = "commodity_id";
        String ORDERS_STATUS = "order_status";
        String ORDERS_USER_ID = "order_user_id";

        String ORDERS_ID = "id";

		String ORDERS_SELLER_ID = "seller_id";

		String ORDERS_TRACKING_NUMBER = "tracking_number";
        String ORDER_NO = "order_no";
        String AGREE_TIME = "agree_time";
		String ORDER_CREATE_TIME = "create_time";
		String APPLY_REFUND_TIME = "apply_refund_time";
		String AMOUNT_RECEIVED_TIME = "amount_received_time";
		String IS_RECEIPT = "is_receipt";

		String ORDER_UPDATE_TIME="update_time";

    }

    /**
     * 收货地址表
     */
    interface ReceivingAddress {
        String ADDRESS_STATUS = "status";
        String ADDRESS_DEFAULTS = "defaults";
        String ADDRESS_USER_ID = "user_id";
    }

    /**
     * 钱包表
     */
    interface Wallet {
        String WALLET_USER_ID = "user_id";
        String PAYMENT_PASSWORD = "payment_password";
		String WALLET_ORDERNO = "order_no";
		String WALLET_STATUS = "status";
		String PAYMENTID = "payment_id";

    }

	interface PaymentCompleteErr {
		String PAYMENT_COMPLETE_STATUS = "status";
		String PAYMENT_COMPLETE_ORDER_NO = "order_no";
	}

    /**
     * 排行榜
     */
    interface RankingList {
        String RANKING_DATE = "rank_date";
        String RANK_TYPE = "rank_type";
        String RANK_SORT = "sort";
    }

    /**
     * 订单评价表
     */
    interface OrdersAppraisePictureUrl {
        String ORDERS_PICTURE_ORDER_ID = "orders_id";
        String ORDERS_PICTURE_ORDER_STATUS = "status";
    }

    /**
     * 充值记录表
     */
    interface WalletRechargeInfo {
        String RECHARGE_NO = "recharge_no";
        String RECHARGE_STATUS = "status";
    }

    /**
     * 售后
     */
    interface AfterSale{
        String BUYER_ID= "buyer_id";
        String SELLER_ID = "seller_id";
        String AFTER_SALE_STATUS="after_sale_status";
    }

	/**
	 * 收藏表
	 */
	interface collect{
		String ID = "id";
		String COLLECT_PRODUCT_ID = "product_id";
		String COLLECT_USER_ID = "user_id";
		String STATUS = "status";
		String COLLECT_SHOP = "shop";
	}


	/**
	 * 仲裁表
	 */
	String JOBUSERID = "user_id";
	String JOBSTATUS = "job_status";

}
