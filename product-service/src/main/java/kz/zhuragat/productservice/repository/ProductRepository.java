package kz.zhuragat.productservice.repository;

import kz.zhuragat.productservice.model.*;
import org.springframework.data.mongodb.repository.*;

public interface ProductRepository extends MongoRepository<Product, String> {
}
