class Solution {
    public int solution(int chicken) {
        int service = 0;
        
        while (chicken >= 10) {
            // 10장 당 서비스 치킨 추가
            service += chicken / 10;

            // - chicken / 10: 서비스 치킨으로 교환 후 남은 쿠폰 수
            // - chicken % 10: 현재 서비스 치킨을 제공받기 위해 사용하지 않고 남은 쿠폰 수
            chicken = chicken / 10 + chicken % 10;
        }
        
        return service;
    }
}