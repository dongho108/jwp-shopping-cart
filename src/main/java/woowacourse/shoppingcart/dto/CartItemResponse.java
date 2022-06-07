package woowacourse.shoppingcart.dto;

public class CartItemResponse {
    private Long id;
    private Long productId;
    private String name;
    private int price;
    private int quantity;
    private String imageURL;

    private CartItemResponse() {
    }

    public CartItemResponse(Long id, Long productId, String name, int price, int quantity, String imageURL) {
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.imageURL = imageURL;
    }

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getImageURL() {
        return imageURL;
    }
}
