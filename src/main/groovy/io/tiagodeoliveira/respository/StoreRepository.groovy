package io.tiagodeoliveira.respository


import io.tiagodeoliveira.model.data.StoreDO
import org.springframework.data.orient.object.repository.OrientObjectRepository

/**
 * @author Tiago de Oliveira
 * @since 6/17/15
 */
interface StoreRepository extends OrientObjectRepository<StoreDO> {
}
