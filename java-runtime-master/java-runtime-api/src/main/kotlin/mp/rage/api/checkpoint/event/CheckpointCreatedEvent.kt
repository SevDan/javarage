package mp.rage.api.checkpoint.event

import mp.rage.api.checkpoint.Checkpoint

data class CheckpointCreatedEvent(
        val checkpoint : Checkpoint
) : CheckpointEvent(checkpoint)