CREATE DATABASE petshop_db;
USE petshop_db;

-- 1. Manage Employees
CREATE TABLE employees (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    role VARCHAR(50) NOT NULL, -- 'Manager', 'Staff', 'Security'
    phone VARCHAR(20),
    salary DECIMAL(10, 2),
    status VARCHAR(20) DEFAULT 'Active'
);

CREATE TABLE shifts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employee_id INT,
    shift_date DATE,
    start_time TIME,
    end_time TIME,
    attendance_status VARCHAR(20) DEFAULT 'Pending', -- 'Present', 'Absent'
    FOREIGN KEY (employee_id) REFERENCES employees(id)
);

-- 2. Manage Customers & Pets
CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(20)
);

CREATE TABLE pets (
    id INT AUTO_INCREMENT PRIMARY KEY,
    owner_id INT,
    name VARCHAR(50),
    species VARCHAR(50), -- Dog, Cat
    health_status TEXT,
    FOREIGN KEY (owner_id) REFERENCES customers(id)
);

-- 3. Manage Products
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    price DECIMAL(10, 2),
    stock_quantity INT
);

CREATE TABLE orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    order_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    total_amount DECIMAL(10, 2),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);
