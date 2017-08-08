package kr.co.mash_up.nine_tique.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QZzimProduct is a Querydsl query type for ZzimProduct
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QZzimProduct extends EntityPathBase<ZzimProduct> {

    private static final long serialVersionUID = -471321416L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QZzimProduct zzimProduct = new QZzimProduct("zzimProduct");

    public final QAbstractEntity _super = new QAbstractEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QZzimProduct_Id id;

    public final QProduct product;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QZzim zzim;

    public QZzimProduct(String variable) {
        this(ZzimProduct.class, forVariable(variable), INITS);
    }

    public QZzimProduct(Path<? extends ZzimProduct> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QZzimProduct(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QZzimProduct(PathMetadata metadata, PathInits inits) {
        this(ZzimProduct.class, metadata, inits);
    }

    public QZzimProduct(Class<? extends ZzimProduct> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QZzimProduct_Id(forProperty("id")) : null;
        this.product = inits.isInitialized("product") ? new QProduct(forProperty("product"), inits.get("product")) : null;
        this.zzim = inits.isInitialized("zzim") ? new QZzim(forProperty("zzim"), inits.get("zzim")) : null;
    }

}

