# Mobile Apps 1 Project

- Student Name: Your name
- Student ID: 123456
- Course: Your course

## Requirement Checklist

- [x] 1. Authentication
  - [x] 1.1. Allow User to Signup
  - [x] 1.2. Log In using username and password
  - [x] 1.3. Store userID once logged in to keep the user logged in (even after restarting the app)
- [x] 2. Product Listing
  - [x] 2.1. List Product Categories
  - [x] 2.2. On clicking a Category, list Products in that Category
  - [x] 2.3. On clicking a Product, show Product description, show buy button and controls to change quantity.
- [x] 3. Cart
  - [x] 3.1. Show cart summary
  - [x] 3.2. Show total amount
  - [x] 3.3. Purchase button to place an order, show order notification
- [ ] 4. Show order history
  - [x] 4.1. List users orders
  - [ ] 4.2. On clicking an Order, show Order details and Products ordered
  - [x] 4.3. On clicking a Product, take them to Product description page created for 2.3
- [ ] 5. Show User details
  - [ ] 5.1. Use the stored userID to show user details
  - [x] 5.2. Show a random circular profile image
  - [ ] 5.3. Show Logout button, on click take back to Signup / Log In page (Restart should not auto login after logout)
- [x] 6. UI/Implementational Requirements
  - [x] 6.1. RecyclerView used for all Lists: Categories, Products, Orders
  - [x] 6.2. If logged in, attach authentication token to all requests until logout
  - [ ] 6.3. Add a small "About this app" button in the profile page, that shows a page on click with your copyright details and credits
- [x] 7. Bonus
  - [x] 7.1. ViewPager2 with bottom TabLayout for: Shop, Cart, Orders, Profile icons
  - [ ] 7.2. Show a map fragment based on the GPS co-ordinates in the user profile

## Additional Features implemented

This is an optional section, feel free to remove this.

## Report

This academic project aimed to create a mobile application in the form of a store, utilizing concepts learned in the Mobile App 1 course at the Computer Science program.

The application is a product store targeting the Beyhive (fans of Beyoncé) in celebration of the artist's new world tour.

The store is categorized into CD, DVD, Vinyl, and Merchandise, with one representative item from each category.

The provided code includes several key components. The `MainActivity` class handles user authentication by sending a login request to a fake API. Upon successful authentication, the user is redirected to the `ProductCategoriesActivity`, which displays the categorized products. Each product is shown with its details, including title, fee, description, and an image. Users can add items to their cart, which is managed by the `CartListActivity`. The cart displays the selected items, calculates the total fee, tax, delivery charges, and overall total. The code also includes a `CategoryDomain` class representing a product category.

However, based on the video provided, there was an error on the Checkout page, where the purchase values and delivery charges were expected to be displayed.

I hope you will consider the effort put into this project.

## References and Credits

1. RecyclerView Example. URL: [Link](https://example.org)
1. ViewPager2 Blog. URL: [Link](https://example.org)

## APK Releases

1. Add your release name and update this [link](https://example.org)