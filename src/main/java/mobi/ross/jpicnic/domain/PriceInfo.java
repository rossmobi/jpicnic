package mobi.ross.jpicnic.domain;

record PriceInfo (
	int Price,             //`json:"price"`
	String PriceColor,     //`json:"price_color"`
	int OriginalPrice,     //`json:"original_price"`
	int Deposit,           //`json:"deposit"`
	String BasePriceText   //`json:"base_price_text"`
){}
