-- CREATE TABLE products (
--     id INT PRIMARY KEY AUTO_INCREMENT,
--     name VARCHAR(255),
--     description TEXT,
--     brand VARCHAR(100),
--     price DECIMAL(10, 2),
--     category VARCHAR(100),
--     release_date DATE,
--     available BOOLEAN,
--     quantity INT
-- );


INSERT INTO product (name, desc, brand, price, category, release_date, available, quantity) VALUES
('Wireless Mouse', 'Smooth and responsive', 'LogiTech', 1299.99, 'Electronics', '2024-01-15', true, 100),
('Gaming Keyboard', 'RGB mechanical keys', 'Razer', 5999.50, 'Electronics', '2024-02-20', true, 50),
('Smartphone', 'Latest Android phone', 'Samsung', 74999.00, 'Mobile', '2023-12-10', true, 25),
('Coffee Maker', 'Brews in 5 minutes', 'Philips', 2499.00, 'Home Appliance', '2022-11-11', false, 0),
('LED Monitor', '27 inch Full HD', 'Dell', 11999.00, 'Computers', '2023-05-05', true, 30),
('Bluetooth Speaker', 'Waterproof and loud', 'Boat', 1999.00, 'Audio', '2024-03-22', true, 75),
('Running Shoes', 'Comfortable and durable', 'Nike', 3499.00, 'Footwear', '2024-06-01', true, 60),
('Backpack', 'Laptop compatible', 'Wildcraft', 1499.00, 'Accessories', '2023-07-30', true, 90),
('Digital Watch', 'Touchscreen with GPS', 'Fastrack', 3999.00, 'Wearables', '2023-09-18', false, 10),
('Electric Kettle', '1.5L stainless steel', 'Prestige', 1599.00, 'Kitchen', '2024-04-10', true, 40);
