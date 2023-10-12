# RentACar Brand Management Service

RentACar Brand Management Service is a Spring-based microservice that provides functionality for managing car brands. It includes features for listing all brands, getting brand details by ID, adding new brands, updating existing brands, and deleting brands. This README provides an overview of the project and its functionality.

## Project Structure

The project consists of the following key components:

- `BrandManager`: This is the main service class that handles brand-related operations such as listing, adding, updating, and deleting brands.

- `BrandRepository`: This is the repository interface that defines database operations for the `Brand` entity.

- `BrandBusinessRules`: This class contains business rules for brand management, including checking if a brand name already exists.

- `ModelMapperService`: A utility service for mapping between request and response objects.

- Various request and response classes: These classes define the data structures used for requests and responses in the service.

## Functionality

The Brand Management Service offers the following functionality:

- **List All Brands**: Retrieve a list of all registered car brands.

- **Get Brand by ID**: Retrieve detailed information about a specific brand by providing its ID.

- **Add Brand**: Add a new car brand to the system. It includes validation to check if the brand name already exists.

- **Update Brand**: Update an existing brand's information.

- **Delete Brand**: Delete a brand by its ID.

## API Endpoints

The service provides the following REST API endpoints:

- `GET /api/brands`: Retrieve a list of all car brands.

- `GET /api/brands/{id}`: Retrieve details of a brand by ID.

- `POST /api/brands`: Add a new brand.

- `PUT /api/brands/{id}`: Update an existing brand.

- `DELETE /api/brands/{id}`: Delete a brand by ID.

## Getting Started

These instructions will help you set up and run the project on your local machine for development and testing.

### Prerequisites

Make sure you have the following software installed:

- Java Development Kit (JDK)
- Maven
- Your preferred Integrated Development Environment (IDE)
- PostgreSql or another compatible database

### Installation

1. Clone this project:
git clone https://github.com/seckinguzel/rentACar-master.git
