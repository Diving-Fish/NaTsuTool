package Config;

public class Setting {

    public static class Api {
        // 内部静态类 Login
        public static String Login() { return "UserLoginApiMaimaiChn"; }
        public static String ratting() {
            return "GetUserPreviewApiMaimaiChn";
        }
        public static String juan() {
            return "UpsertUserChargelogApiMaimaiChn";
        }
        public static String logout() {
            return "UserLogoutApiMaimaiChn";
        }
        public static String userData() { return "GetUserDataApiMaimaiChn"; }
        public static String userExtend() { return "GetUserExtendApiMaimaiChn"; }
        public static String userOption() { return "GetUserOptionApiMaimaiChn"; }
        public static String userRatting() { return "GetUserRatingApiMaimaiChn"; }
        public static String userChargeListforTrack() { return "GetUserChargeApiMaimaiChn"; }
//        public static String userCharacterList() { return "16768656af052a9a3cd612e3a612a219"; } //旅行伙伴updata
        public static String userItemList() { return "e168a0bcd17a57ce9ce302b4ad9c4713";} //用户物品updata
        public static String userMapList() { return "GetUserMapApiMaimaiChn"; }
    }

    public static class Key {
        public static String AES(){
            return "";
        }
        public static String IV(){
            return "";
        }
        public static String obfuscate(){return "";}
    }

    public static class ServerConfig {
        public static String Host() {
            return "";
        }

        public static int Port() {
            return ;
        }

        public static String Path() {
            return "";
        }

        public static String Version() {return ""; }
    }
    public static String clientId() {
        return "";
    }

    public static class Others {
        public static int Thread() { return 5; }
    }
}
