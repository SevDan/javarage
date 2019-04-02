package mp.rage.api.checkpoint.event

import mp.rage.api.checkpoint.Checkpoint

data class CheckpointDestroyedEvent (
        val checkpoint : Checkpoint
) : CheckpointEvent(checkpoint)