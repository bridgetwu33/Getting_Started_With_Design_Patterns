/**
 * Strategy interface defining an action which every algorithm class must implement- pay
 * and concrete strategy classes implementing the Strategy interface
 * Context (ShoppingCart) interacts with various strategy implementation using this interface only.
 * Context is not aware of that with which Strategy implementation it is interacting with.
 *
 * @Author Bridget Wu
 */
 export interface PaymentStrategy {
    /**
     * Payment strategy action algorithm
     *
     * @param price
     */
    pay(price: number): void;
}
